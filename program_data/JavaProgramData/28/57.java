package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i = 0;
		String a = new String(new char[100]);
		while (scanf("%s",a) != EOF)
		{
			if (i == 0)
			{
				System.out.printf("%d",a.length());
				i++;
			}
		 else
		 {
			 System.out.printf(",%d",a.length());
		 }
		}
	}

}
