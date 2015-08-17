package com.n8.marveldroid.EntityModelObjects;

import java.util.Date;
import java.util.List;

public class Character extends Entity {
    public String name;

    public String description;

    public Date modified;

    public String resourceURI;

    public List<Url> urls;

    public ImageInfo thumbnail;

    public ItemList comics;

    public ItemList stories;

    public ItemList events;

    public ItemList series;
}
