package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int panduan = new int(char * z,int len);
		int i;
		int n;
		int len;
		String zifu = new String(new char[82]);
		String z = zifu;
		zifu = new Scanner(System.in).nextLine();
		n = Integer.parseInt(zifu);
		for (i = 0;i < n;i++)
		{
			zifu = new Scanner(System.in).nextLine();
			len = zifu.length();
		tangible.RefObject<String> tempRef_z = new tangible.RefObject<String>(z);
			System.out.printf("%d\n",panduan(tempRef_z, len));
			z = tempRef_z.argValue;
		}
		return 0;
	}
	public static int panduan(tangible.RefObject<String> z, int len)
	{
		int i;
		for (i = 0;i < len;i++)
		{
			if (i == 0)
			{
				if (z.argValue != '_' && (z.argValue > 'z' || z.argValue < 'a') && (z.argValue>'Z' || z.argValue < 'A'))
				{
					return 0;
				}
			}
			else
			{
				if (*(z.argValue.Substring(i)) != '_' && (*(z.argValue.Substring(i)) > 'z' || *(z.argValue.Substring(i)) < 'a') && (*(z.argValue.Substring(i))>'Z' || *(z.argValue.Substring(i)) < 'A') && (*(z.argValue.Substring(i))>'9' || *(z.argValue.Substring(i)) < '0'))
				{
					return 0;
				}
			}
		}
		return 1;
	}
}

