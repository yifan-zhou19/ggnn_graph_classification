package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N = new String(new char[100]);
		int[] a = new int[100];
		int b = 0;
		int i;
		int l;
		int count = 0;
		N = new Scanner(System.in).nextLine();
		l = N.length();
		for (i = 0;i < l;i++)
		{
			N = tangible.StringFunctions.changeCharacter(N, i, N.charAt(i) - '0');
			b = 10 * b + N.charAt(i);
			a[i] = b / 13;
			b = b % 13;
			count++;
		}
		 if (count == 1 || (count == 2 && a[0] == 0 && a[1] == 0))
		 {
		 System.out.print("0");
		 }
		 else
		 {
		 if (a[0] != 0)
		 {
			 for (i = 0;i < l;i++)
			 {
		  System.out.printf("%d",a[i]);
			 }
		 }
		  else if (a[0] == 0 && a[1] != 0)
		  {
		  for (i = 1;i < l;i++)
		  {
		  System.out.printf("%d",a[i]);
		  }
		  }
		   else if (a[0] == 0 && a[1] == 0)
		   {
		  for (i = 2;i < l;i++)
		  {
		  System.out.printf("%d",a[i]);
		  }
		   }
		 }
		  System.out.printf("\n%d",b);
		  System.in.read();
		  System.in.read();
	}

}

