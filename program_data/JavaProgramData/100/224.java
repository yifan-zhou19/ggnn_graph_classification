package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int i;
			int j;
			String b = new String(new char[301]);
			final String c = "abcdefghijklmnopqrstuvwxyz";
			int[] d = new int[26];

			b = new Scanner(System.in).nextLine();

			for (i = 0;i < b.length();i++)
			{

					for (j = 0;j < 26;j++)
					{
							if (b.charAt(i) == c.charAt(j))
							{
								d[j]++;
							}
					}
			}

				j = 0;
							for (i = 0;i < 26;i++)
							{
									if (d[i] > 0)
									{
									System.out.printf("%c=%d\n",c.charAt(i),d[i]);
									j++;
									}
							}
									if (j == 0)
									{
										System.out.print("No");
									}

	}

}
