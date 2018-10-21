package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[510];
	public static int[] b = new int[510];
	public static void function()
	{
		int lena;
	  for (int i = 0;i <= 500;i++)
	  {
		  if (a[i] == -1)
		  {
			  lena = i - 1;
			  break;
		  }
	  }
	  //???a[],??0-lena

	  for (int i = 500;i >= 500 - lena;i--)
	  {
			  a[i] = a[500 - i];
			  b[i] = a[500 - i];
	  }
	  //??a[],????b[]


	  for (int i = 500 - lena;i <= 500;i++)
	  {
		  a[i] = 2 * a[i];
		  if (a[i] >= 10)
		  {
			  a[i] = a[i] - 10;
			  a[i - 1]++;
			  if (a[i - 1] == 0)
			  {
				  a[i - 1]++;
				  lena++;
			  } //?????????????
		  }
	  }

	  for (int i = 0;i <= lena;i++)
	  {
		   a[i] = a[500 - i];
		   b[i] = -1;
	  }
	  //??a[]????b[]
	}
	public static int Main()
	{
		a[0] = 2;
		b[0] = -1;
		for (int i = 1;i <= 500;i++)
		{
			a[i] = -1;
			b[i] = -1;
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
		}
		else if (n == 1)
		{
			System.out.print("2");
		}
		else
		{
		for (int j = 1;j < n;j++)
		{
			 function();
		}

		int lena;
		for (int i = 0;i <= 500;i++)
		{
		  if (a[i] == -1)
		  {
			   lena = i - 1;
			   break;
		  }
		}

		for (int i = lena;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		}
		return 0;
	}


}

