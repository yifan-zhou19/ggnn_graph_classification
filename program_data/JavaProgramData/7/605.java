package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yuan = new String(new char[256]);
		String sub = new String(new char[256]);
		String replace = new String(new char[256]);
		char[][] sz = new char[256][256];
		yuan = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();
		int n = sub.length();
		int m = yuan.length();
		int i;
		int k;
		int result;
		int a = 0;
		int b = 0;
		for (i = 0;i <= m - n;i++)
		{
						   for (k = 0;k < n;k++)
						   {
										   sz[a][b] = yuan.charAt(i + k);
										   b++;
						   }
										   sz[a][b] = '\0';
										   a++;
										   b = 0;
		}
										   for (i = 0;i < a;i++)
										   {
														   result = strcmp(sz[i],sub);
														   if (result == 0)
														   {
																		sz[i] = replace;
																		System.out.printf("%s",sz[i]);
																		i += n;
	break;
														   }
																		else
																		{
																		System.out.printf("%c",yuan.charAt(i));
																		}
										   }
										   for (i = i;i < m;i++)
										   {
															System.out.printf("%c",yuan.charAt(i));
										   }














			return 0;
	}

}
