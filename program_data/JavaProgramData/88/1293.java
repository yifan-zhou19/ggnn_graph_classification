package <missing>;

public class GlobalMembers
{
	public static void sum(tangible.RefObject<String> p)
	{
		int[] a = new int[10];
		int i;
		int j = 0;
		int b = 0;
		for (i = 0; * (p.argValue.Substring(i)) != '\0'; i++)
		{
			if (*(p.argValue.Substring(i)) >= '0' && *(p.argValue.Substring(i)) <= '9')
			{
				b = (p.argValue.Substring(i)) - 48 + b * 10;
				if (*(p.argValue.Substring(i) + 1) < '0' || *(p.argValue.Substring(i) + 1)>'9') //||
				{
					a[j] = b;
					j++;
					b = 0;
				}
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.printf("%d",a[i]);
			System.out.print("\n");
		}

	}
	public static int Main()
	{
		void sum(char * p);
		String s = new String(new char[50]);
		String p = s;
		s = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
		sum(tempRef_p);
		p = tempRef_p.argValue;
			return 0;
	}

}

