package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[5000]);
		char[][] words = new char[200][50];
		int[] k = new int[200];
		zfc = new Scanner(System.in).nextLine();
		int len = zfc.length();
		int i;
		int j;
		int w = 0;
		for (i = 0;i < len;i++)
		{
			if (zfc.charAt(i) != ' ' && zfc.charAt(i) != ',')
			{
				for (j = i;zfc.charAt(j) != ' ' && zfc.charAt(i) != ',' && j < len;j++)
				{
					words[w][j - i] = zfc.charAt(j);
				}
				words[w][j - i] = '\0';
				w++;
				i = j;
			}
		}
	//	for(i=0;i<w;i++)
	//	{
	//		printf("%s\n",words[i]);
	//	}
		for (i = 0;i < w;i++)
		{
			k[i] = String.valueOf(words[i]).length();
		}
	//	int e;
	//    for(int x=1;x<w;x++)
	//	{
	//		for(i=0;i<w-x;i++)
	//		{
	//			if(k[i] > k[i+1])
	//			{
	//				e = k[i+1];
	//				k[i+1] = k[i];
	//				k[i] = e;
	//			}
	//		}
	//	}
		int min = k[0];
		int p = 0;
		for (i = 1;i < w;i++)
		{
			if (k[i] < min)
			{
				min = k[i];
				p = i;
			}
		}
		int max = k[0];
		int q = 0;
		for (i = 1;i < w;i++)
		{
			if (k[i] > max)
			{
				max = k[i];
				q = i;
			}
		}
		System.out.printf("%s\n",words[q]);
		System.out.printf("%s\n",words[p]);




		return 0;
	}
}
