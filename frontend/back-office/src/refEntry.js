import React from 'react';
import {
    Create,
    Edit,
    SimpleForm,
    TextInput,
    DateInput,
    ReferenceManyField,
    Datagrid,
    TextField,
    DateField,
    EditButton
} from 'react-admin';
// import RichTextInput from 'ra-input-rich-text';
import JSONSchemaForm from './form';

// export const PostCreate = (props) => (
//     <Create {...props}>
//         <SimpleForm>
//             <TextInput source="title" />
//             <TextInput source="teaser" options={{ multiLine: true }} />
//             <RichTextInput source="body" />
//             <DateInput label="Publication date" source="published_at" defaultValue={new Date()} />
//         </SimpleForm>
//     </Create>
// );

export const RefEntryEdit = (props) => (
    <Edit {...props}>
        <SimpleForm>
            <JSONSchemaForm></JSONSchemaForm>
        </SimpleForm>
    </Edit>
);