package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b = 0;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
			if (b == 0 && a[i] < 48 && a[i]>57)
			{
				continue;
			} //???????????????????b==0?????\n??continue
			else if (a[i] >= 48 && a[i] <= 57)
			{
				System.out.printf("%c",a[i]);
				b = b + 1;
			} //??????ASCII??48?57????????????????b?1
			if (b >= 1 && a[i] != '0' && a[i] != '1' && a[i] != '2' && a[i] != '3' && a[i] != '4' && a[i] != '5' && a[i] != '6' && a[i] != '7' && a[i] != '8' && a[i] != '9')
			{
				System.out.print("\n");
				b = 0;
			} //??????????????????b>=1?????
		}
		return 0;
	}

}
