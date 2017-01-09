package com.davidjeong.recpreadytocookandprepare;

public class IngredientsFragment extends CheckBoxesFragment{

    @Override
    public String[] getItems(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
