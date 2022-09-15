inherit bundle

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs = "core-image-minimal"

RAUC_KEYRING_FILE = "${THISDIR}/files/ca.cert.pem"
RAUC_CERT_FILE = "${THISDIR}/files/development-1.cert.pem"
# NOTE: usually you keep the private key out of the Git repo.
# This is just a test key to show how to do it.
RAUC_KEY_FILE = "${THISDIR}/files/private/development-1.key.pem"
