import React, {Component} from 'react';
import Form from 'react-jsonschema-form'

const mySchema = {
    "title": "A registration form",
    "description": "A simple form example.",
    "type": "object",
    "required": [
        "firstName",
        "lastName"
    ],
    "properties": {
        "firstName": {
            "type": "string",
            "title": "First name",
            "default": "Chuck"
        },
        "lastName": {
            "type": "string",
            "title": "Last name"
        },
        "age": {
            "type": "integer",
            "title": "Age"
        },
        "bio": {
            "type": "string",
            "title": "Bio"
        },
        "password": {
            "type": "string",
            "title": "Password",
            "minLength": 3
        },
        "telephone": {
            "type": "string",
            "title": "Telephone",
            "minLength": 10
        }
    }
};

export default class JSONSchemaForm extends Component {
    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit({formData}) {
        alert(formData);
    }

    render() {
        return (
            <Form schema={mySchema} onSubmit={this.handleSubmit}/>
        )
    }
}