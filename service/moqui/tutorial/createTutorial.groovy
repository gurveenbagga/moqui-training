def moquiTutorial = ec.entity.makeValue("moqui.tutorial.MoquiTutorial")
moquiTutorial.setFields(context, true, null, null)
if (!moquiTutorial.tutorialId) moquiTutorial.setSequencedIdPrimary()
moquiTutorial.create()
