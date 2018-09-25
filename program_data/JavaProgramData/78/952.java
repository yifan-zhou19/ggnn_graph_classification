package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		/*printf("l 50\n");
		printf("q 40\n");
		printf("z 20\n");
		printf("s 10");*/
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
		for (q = 1;q <= 5;q++)
		{
		for (s = 1;s <= 5;s++)
		{
		for (l = 1;l <= 5;l++)
		{
		if (z + q != s + l)
		{
		continue;
		}
		else if (z + l <= s + q)
		{
		continue;
		}
		else if (z + s >= q)
		{
		continue;
		}
		if (z == q || z == s || z == l || q == s || q == l || s == l)
		{
		continue;
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto l;
		}
		}
		}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l:
	z *= 10;
	q *= 10;
	s *= 10;
	l *= 10;
		char bskc;
		char[] name = {'z', 'q', 's', 'l'};
		int bski;
		int[] weight = new int[4];
		weight[0] = z;
		weight[1] = q;
		weight[2] = s;
		weight[3] = l;
		for (int i = 0;i < 4;i++)
		{
		for (int j = i + 1;j < 4;j++)
		{
		if (weight[i] < weight[j])
		{
			bski = weight[i];
			weight[i] = weight[j];
			weight[j] = bski;
			bskc = name[i];
			name[i] = name[j];
			name[j] = bskc;
		}
		}
		}
		for (int i = 0;i < 4;i++)
		{
		System.out.printf("%c %d\n",name[i],weight[i]);
		}
		return 0;
	}

}
