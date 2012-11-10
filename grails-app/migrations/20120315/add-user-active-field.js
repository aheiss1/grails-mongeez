//mongeez formatted javascript

//changeset frank:all-existing-users-active
db.user.update({}, {$set: {active: true}}, false, true);

//changeset frank:ensure-user-active-always-exists runAlways:true
db.user.update({active: {$exists: false}}, {$set: {active: false}}, false, true);
