package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000 + 10];
		int[] y = new int[1000 + 10];
		int[] presence = new int[1000 + 10];
		int digit;
		int i;
		int j;
		int k;
		int nperson = 0;
		int finaltime = 0;
		char c;
		x[nperson++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				digit = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				x[nperson] = digit;
				nperson++;
			}
		}
		nperson = 0;
		y[nperson++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				digit = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				y[nperson] = digit;
				nperson++;
				finaltime = finaltime > digit != 0 ? finaltime : digit;
			}
		}
		//cout << nperson;
		//for (i = 0; i < nperson; i ++)
		//	cout << x[i] << " ";
		//cout << endl;
		//for (i = 0; i < nperson; i ++)
		//	cout << y[i] << " ";
		//cout << endl;

		for (i = 0; i < nperson; i++)
		{
			for (j = x[i]; j <= y[i] - 1; j++)
			{
				presence[j]++;
			}
		}
		int maxperson = 0;
		for (i = 0; i < finaltime; i++)
		{
			//cout << presence[i] << " ";
			maxperson = maxperson > presence[i] != 0 ? maxperson : presence[i];
		}
		//cout << endl;
		System.out.print(nperson);
		System.out.print(" ");
		System.out.print(maxperson);
		System.out.print("\n");
		return 0;
	}
}

