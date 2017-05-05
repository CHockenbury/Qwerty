package com.mime.qwerty.graphics;

import java.util.Random;

import com.mime.qwerty.Game;

public class Screen extends Render {

	private Render test;
	private int WIDTH = 250;
	private int HEIGHT = 250;

	public Screen(int width, int height) {
		super(width, height);
		Random random = new Random();
		test = new Render(WIDTH, HEIGHT);
		int ne = 0;
		for (int i = 0; i < WIDTH * HEIGHT; i++) {

			//random.nextInt() * (random.nextInt(5) / 4);
			if (i % 2500 == 0) {
				ne = Math.abs(random.nextInt());
			}
			test.pixels[i] = ne;
		}
	}

	public void render(Game game) {
		for (int i = 0; i < width * height; i++)
		{
			pixels[i] = 0;
		}
		for (int i = 0; i < 50; i++) {
			int anim  = (int) (Math.sin((game.time + i) % 1000.0 / 100) * 100);
			int anim2 = (int) (Math.cos((game.time + i) % 1000.0 / 100) * 100);
			draw(test, (width - 256) / 2 + anim, (height - 256) / 2 - + anim2);
		}
	}

}
