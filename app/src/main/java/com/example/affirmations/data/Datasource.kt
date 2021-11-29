package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10),
            Affirmation(R.string.affirmation11, R.drawable.image11),
            Affirmation(R.string.affirmation12, R.drawable.image12),
            Affirmation(R.string.affirmation13, R.drawable.image13),
            Affirmation(R.string.affirmation14, R.drawable.image14),
            Affirmation(R.string.affirmation15, R.drawable.image15),
            Affirmation(R.string.affirmation16, R.drawable.image16),
            Affirmation(R.string.affirmation17, R.drawable.image17),
            Affirmation(R.string.affirmation18, R.drawable.image18),
            Affirmation(R.string.affirmation19, R.drawable.image19),
            Affirmation(R.string.affirmation20, R.drawable.image20)
        )
    }
}