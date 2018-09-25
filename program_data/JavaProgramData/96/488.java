package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] b = new int[200];
		int[] c = new int[200];
		int s;
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 200;i++)
		{
		 if (a.charAt(i) != '\0')
		 {
			 b[i] = a.charAt(i) - '0';
		 }
		 else
		 {
			 break;
		 }
		}
		if (a.charAt(1) == '\0')
		{
		  System.out.print("0\n");
		  System.out.printf("%c\n",a.charAt(0));
		  //scanf("%d",&j);
		  return 0;
		}
		for (j = 1;j < i;j++)
		{
		  if (j > 1)
		  {

				  s = b[j - 2] * 100 + b[j - 1] * 10 + b[j];
				  b[j - 2] = 0;
		  }
		  else
		  {
			  s = b[1] + b[0] * 10;
		  }
		  b[j] = s % 13;

		  if (b[j] >= 10)
		  {
			b[j - 1] = 1;
			b[j] = b[j] - 10;
		  }
		  else
		  {
			  b[j - 1] = 0;
		  }
		  c[j] = s / 13;
		}
		int ss = 0;
		for (j = 0;j < i;j++)
		{
		if (c[j] != 0 || ss != 0 || j == i - 1)
		{
		  System.out.printf("%d",c[j]);
		  ss = 1;
		}
		}
		System.out.print("\n");
		if (b[i - 2] != 0)
		{
			System.out.printf("%d",b[i - 2]);
		}
		System.out.printf("%d\n",b[i - 1]);
		//scanf("%d",&j);
		return 0;
	}



}
