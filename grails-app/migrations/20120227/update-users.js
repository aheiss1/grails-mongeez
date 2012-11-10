//mongeez formatted javascript

//changeset bob:rename-name-to-firstName
db.user.update({name: {$exists: true}}, {$rename: {name: 'firstName'}}, false, true);

//changeset bob:add-user-last-name
db.user.update({firstName: 'Atticus'}, {$set: {lastName: 'Hyperion'}});
db.user.update({firstName: 'Blaine'}, {$set: {lastName: 'Zachariah'}});
db.user.update({firstName: 'Caelum'}, {$set: {lastName: 'Draco'}});
db.user.update({firstName: 'Damien'}, {$set: {lastName: 'Nilo'}});
db.user.update({firstName: 'Elspeth'}, {$set: {lastName: 'Rosalind'}});
db.user.update({firstName: 'Freya'}, {$set: {lastName: 'Eloise'}});
db.user.update({firstName: 'Genesis'}, {$set: {lastName: 'Alexander'}});
db.user.update({firstName: 'Hermione'}, {$set: {lastName: 'Octavia'}});
db.user.update({firstName: 'Isadora'}, {$set: {lastName: 'Fate'}});
db.user.update({firstName: 'Jared'}, {$set: {lastName: 'Saul'}});
db.user.update({firstName: 'Kyla'}, {$set: {lastName: 'Fallon'}});
db.user.update({firstName: 'Lucia'}, {$set: {lastName: 'Nemesis'}});
db.user.update({firstName: 'Magnus'}, {$set: {lastName: 'Ishmael'}});
db.user.update({firstName: 'Narcissa'}, {$set: {lastName: 'Amethyst'}});
db.user.update({firstName: 'Orion'}, {$set: {lastName: 'Severus'}});
db.user.update({firstName: 'Persephone'}, {$set: {lastName: 'Hera'}});
db.user.update({firstName: 'Quinn'}, {$set: {lastName: 'Helaina'}});
db.user.update({firstName: 'Reagan'}, {$set: {lastName: 'Hestia-Faye'}});
db.user.update({firstName: 'Silas'}, {$set: {lastName: 'Finn'}});
db.user.update({firstName: 'Thebe'}, {$set: {lastName: 'Rosalie'}});
db.user.update({firstName: 'Uston'}, {$set: {lastName: 'Sterling'}});
db.user.update({firstName: 'Vada'}, {$set: {lastName: 'Theodora'}});
db.user.update({firstName: 'Waylin'}, {$set: {lastName: 'Thesus'}});
db.user.update({firstName: 'Xanthie'}, {$set: {lastName: 'Althea'}});
db.user.update({firstName: 'Yvette'}, {$set: {lastName: 'Irelynd'}});
db.user.update({firstName: 'Zephyr'}, {$set: {lastName: 'Indigo'}});

//changeset jane:apply-roles
var userId = db.role.findOne({name: 'user'})._id;
var adminId = db.role.findOne({name: 'admin'})._id;
db.user.update({}, {$set: {roles: [userId]}}, false, true);
db.user.update({firstName: {$in: ['Freya', 'Persephone']}}, {$addToSet: {roles: adminId}}, false, true);
