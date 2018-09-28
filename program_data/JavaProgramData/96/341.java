package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] get = new int[101];
		int i;
		int n = 1;
		int[] shang = new int[100];
		int[] yu = new int[100];
		while ((c = System.in.read()) != '\n')
		{
		 get[n] = c - '0';
		 n++;
		}
		n--;
		  for (i = 1;i <= n;i++)
		  {
		 shang[i] = (yu[i - 1] * 10 + get[i]) / 13;
		 yu[i] = (yu[i - 1] * 10 + get[i]) % 13;
		  }
		if (n == 1)
		{
			System.out.print("0");
		}
		for (i = 2;i <= n;i++)
		{
		  if (i == 2 && shang[i] == 0)
		  {
			  if (n == 2)
			  {
				  System.out.print("0");
				  break;
			  }
			  else
			  {
				  continue;
			  }
		  }
		System.out.print(shang[i]);
		}
		System.out.print("\n");
		System.out.print(yu[n]);
		System.out.print("\n");
		return 0;
	}


}
