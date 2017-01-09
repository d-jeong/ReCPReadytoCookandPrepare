package com.davidjeong.recpreadytocookandprepare;

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getItems(int index) {
        return Recipes.directions[index].split("`");
    }
}
