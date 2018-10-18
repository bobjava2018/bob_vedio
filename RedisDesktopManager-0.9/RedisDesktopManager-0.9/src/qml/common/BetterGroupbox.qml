import QtQuick.Controls 2.2

GroupBox {
    id: root
    property string labelText
    property bool checked: false

    label: BetterCheckbox {
            id: checkBox
            objectName: "checkbox"
            checked: root.checked
            text: root.labelText           
    }
}
