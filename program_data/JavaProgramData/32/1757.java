package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int n;
			int[] result = new int[100];
			String a = new String(new char[100]);
			String b = new String(new char[100]);
			String c = new String(new char[2]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			int i;
			int s;
			int t;
			int j;
			int k;
			for (i = 0;i < n;i++)
			{
					c = new Scanner(System.in).nextLine();
					a = new Scanner(System.in).nextLine();
					b = new Scanner(System.in).nextLine();
					s = a.length();
					t = b.length();
					for (j = s - 1; ;j--)
					{
							if (a.charAt(j) >= b.charAt(j - s + t))
							{
									result[j] = a.charAt(j) - b.charAt(j - s + t);
							}
							else
							{
									result[j] = a.charAt(j) - b.charAt(j - s + t) + 10;
									a.charAt(j - 1)--;
							}
							if (j - s + t == 0)
							{
									break;
							}
					}
					for (k = 0; k < j; k++)
					{
							result[k] = a.charAt(k) - '0';
					}
					if (j > 0)
					{
							for (k = 0;k < s;k++)
							{
									System.out.printf("%d",result[k]);
							}
							System.out.print("\n");
					}
					else
					{
							for (k = 0;k < s;k++)
							{
									if (result[k] != 0)
									{
											break;
									}
							}
							for (j = k;j < s;j++)
							{
									System.out.printf("%d",result[k]);
							}
							System.out.print("\n");
					}
			}
	}
}

