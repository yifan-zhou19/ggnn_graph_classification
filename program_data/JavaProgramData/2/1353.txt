public class zuozhe
{
				public int m;
				public char q;
				public char[][] shu = new char[1001][5];
}

package <missing>;

public class GlobalMembers
{
			public static zuozhe[] zuozhe = tangible.Arrays.initializeWithDefaultzuozheInstances(26);
			public static zuozhe t = new zuozhe();
	public static int Main()
	{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int i;
			String xingming = new String(new char[30]);
			String bianhao = new String(new char[5]);
			final String zimu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for (i = 0;i < 26;i++)
			{
					zuozhe[i].m = 0;
			}
			for (i = 1;i <= n;i++)
			{
					bianhao = ConsoleInput.readToWhiteSpace(true).charAt(0);
					xingming = ConsoleInput.readToWhiteSpace(true).charAt(0);
					int j;
					int k;
					for (j = 0;xingming.charAt(j) != '\0';j++)
					{
							for (k = 0;k < 26;k++)
							{
									if (xingming.charAt(j) == zimu.charAt(k))
									{
											zuozhe[k].m++;
											zuozhe[k].q = zimu.charAt(k);
											zuozhe[k].shu[zuozhe[k].m] = bianhao;
											break;
									}
							}
					}
			}
			int min = 0;
			int maxnum = 0;
			for (i = 0;i < 26;i++)
			{

							if (zuozhe[i].m > maxnum)
							{
									maxnum = zuozhe[i].m;
									min = i;
							}
			}
			System.out.print(zuozhe[min].q);
			System.out.print("\n");
			System.out.print(zuozhe[min].m);
			System.out.print("\n");
			for (i = 1;i <= zuozhe[min].m;i++)
			{
					System.out.print(zuozhe[min].shu[i]);
					System.out.print("\n");
			}
			return 0;
	}
}

