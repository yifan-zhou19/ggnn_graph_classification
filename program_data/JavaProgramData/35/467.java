package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;

		int t = 1;

		int fah = -1;
		int fal = -1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}

		int i;
		int j;

		int[][] word;
		word = new int[h];
		for (i = 0;i < h;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			word[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * l);
		}

		int[] max;
		max = new int[h];

		int[] al;
		al = new int[h];


		for (i = 0;i < h;i++)
		{
			max[i] = 0;
			al[i] = 0;
		}

		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					word[i][j] = Integer.parseInt(tempVar3);
				}
				if (max[i] < word[i][j])
				{
					max[i] = word[i][j];
					al[i] = j;
				}
			}
		}

		for (i = 0;i < h;i++)
		{
			t = 1;
			for (j = 0;j < h;j++)
			{
				if (max[i] > word[j][al[i]])
				{
					t = 0;
					break;
				}
			}
			if (t != 0)
			{
				fah = i;
				fal = al[i];
				break;
			}
		}

		if (fah != -1 || fal != -1)
		{
			System.out.printf("%d+%d\n",fah,fal);
		}
		else
		{
			System.out.print("No\n");
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(word);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(max);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(al);

		return 0;
	}
}

