package com.omelan.burr.components

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.ListItem
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.omelan.burr.model.Recipe

@Composable
fun RecipeList(recipes: List<Recipe>, navigateToRecipe: (recipeId: String) -> Unit ) {
        ScrollableColumn {
            recipes.forEach { recipe ->
                RecipeItem(
                    recipe = recipe,
                    navigateToRecipe = navigateToRecipe,
                )
            }
        }
}

@Preview
@Composable
fun RecipeListPreview() {
    val listOfRecipes = listOf(
        Recipe(id = "1", name = "Ultimate v60", description = "Hoffman"),
        Recipe(id = "2", name = "Ultimate v60", description = "Hoffman"),
        Recipe(id = "3", name = "Ultimate v60", description = "Hoffman"),
    )
    RecipeList(recipes = listOfRecipes, navigateToRecipe = {})
}