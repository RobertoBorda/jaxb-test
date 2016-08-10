package com.journaltech.c;

import com.journaltech.p.Parent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Child")
public class Child {
    @XmlElement(name = "Teacher", namespace = "http://journaltech.com/p", required = true /*, nillable = true*/)
    protected Parent parent;
}
