package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i = 0;
		int j = 0;
		int num = 0;
		int beg = 0;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++; //?????????
		}
		num = i - 1;
		i = 0;
		while (i <= num)
		{
		  while (a.charAt(i) == ' ' && i <= num)
		  {
			  i++; //??????
		  }
		  beg = i;
		  while (a.charAt(i) != ' ' && i <= num)
		  {
			  i++; //??????
		  }
		  for (j = beg;j < i;j++)
		  {
		  System.out.print(a.charAt(j));
		  }
		  if (j != num + 1)
		  {
			  System.out.print(' ');
		  }
		}
		return 0;
	}

}
