package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat 11",
                context.getDrawable(R.drawable.mk11)!!,
                "Mortal Kombat 11 é um jogo eletrônico de luta desenvolvido pela NetherRealm Studios e publicado pela Warner Bros. Interactive Entertainment. É a décima primeira edição principal da série de jogos eletrônicos de luta, Mortal Kombat, e uma continuação direta de Mortal Kombat X",
                4.5f,
                listOf(
                    Console(1, "PlayStation 4", "Sony", "2015-11-21"),
                    Console(2, "Xbox One", "Microsoft", "2015-12-12")
                ))
            )

            games.add(Game(
                2,
                "Street FIghter V",
                context.getDrawable(R.drawable.sf)!!,
                "Street Fighter V é um videojogo de luta publicado pela Capcom, que o produziu em colaboração com o estúdio Dimps. O sexto capítulo da série Street Fighter, foi lançado a 16 de Fevereiro de 2016 para Microsoft Windows e PlayStation 4. Uma versão para Linux tem lançamento previsto para o segundo trimestre de 2016.",
                4.5f,
                listOf(
                    Console(1, "PlayStation 2", "Sony", "2009-11-21"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12")
                ))
            )

            games.add(Game(
                3,
                "The King of Fighters 2002",
                context.getDrawable(R.drawable.kof)!!,
                "The King of Fighters 2002: Challenge to Ultimate Battle é um jogo de videogame produzido pela empresa fabricante de jogos eletrônicos SNK Playmore",
                4.5f,
                listOf(
                    Console(1, "PlayStation 3", "Sony", "2009-11-21"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12")
                ))
            )

            games.add(Game(
                3,
                "Injustice : Gods Amoung Us",
                context.getDrawable(R.drawable.injustice)!!,
                "Injustice: Gods Among Us, é um videojogo de luta produzido pela NetherRealm Studios e publicado pela Warner Brothers Games em Abril de 2013 para Wii U, PlayStation 3, Xbox 360. e PC. Uma versão gratuita para iOS e Android foi editada a 3 de Abril e 21 de Novembro de 2013",
                4.5f,
                listOf(
                    Console(1, "PlayStation 3", "Sony", "2009-11-21"),
                    Console(2, "Xbox 360", "Microsoft", "2008-12-12")
                ))
            )

            return games

        }
    }

}