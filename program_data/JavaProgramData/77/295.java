package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		char nan;
		char nv;
		nan = a.charAt(0);
		int i;
		int j;
		for (i = 0;i < length;i++)
		{
			if (a.charAt(i) != nan)
			{
				nv = a.charAt(i);
				break;
			}
		}
		int[] b = new int[100];
		for (i = 0;i < length;i++)
		{
			if (a.charAt(i) == nv)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == nan && b[j] == 0)
					{
						System.out.printf("%d %d\n",j,i);
						b[j] = 1;
						break;
					}
				}
			}
		}
		/*printf("%c %c",nan,nv);*/
		return 0;
	}
}
