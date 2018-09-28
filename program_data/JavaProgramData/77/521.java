package <missing>;

public class GlobalMembers
{
	//????????
	//??????
	//?????2011-1-8 


	public static int Main()
	{
		String str = new String(new char[500]);
		char s1;
		int i;
		int j;
		int t;
		int[] boy = new int[500];
		int[] girl = new int[500];
		int p = 0;
		int n = 0;
		int[] list = new int[500];
		str = new Scanner(System.in).nextLine();
		s1 = str.charAt(0);
		for (i = 0;i < str.length();i++) //????
		{
		  if (str.charAt(i) == s1)
		  {
		  p++;
		  list[p] = i;
		  }
		  else
		  {
			  n++;
			  girl[n] = i;
			  boy[n] = list[p];
			  p--;
		  } //???????
		}
		for (i = 1;i <= n;i++) //??
		{
		  for (j = 1;j < i;j++)
		  {
			if (girl[i] < girl[j])
			{
				  t = girl[i];
				  girl[i] = girl[j];
				  girl[j] = t;
				  t = boy[i];
				  boy[i] = boy[j];
				  boy[j] = t;
			}
		  }
		}
		for (i = 1;i <= n;i++) //??
		{
			  System.out.print(boy[i]);
			  System.out.print(" ");
			  System.out.print(girl[i]);
			  if (i != n)
			  {
				  System.out.print("\n");
			  }
		}
		return 0;
	}

}
