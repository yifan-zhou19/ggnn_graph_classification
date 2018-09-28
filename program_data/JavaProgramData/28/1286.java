package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a = new String(new char[6000]);
	  int[] b = new int[300];
	  int c = 0;
	  int d = -2;
	  int e;
	  int f;
	  int i;
	  a = new Scanner(System.in).nextLine();
	  b[0] = 0;
	  for (i = 0;;i++)
	  {
		if (a.charAt(i) == 0)
		{
		break;
		}
		else
		{
			if (a.charAt(i) != 32)
			{
			b[c] = b[c] + 1;
			}
			else
			{
				e = i;
			   f = e - d;
			   d = e;
			   if (f != 1)
			   {
			   c = c + 1;
			   }
			}
		}
	  }
	   for (i = 0;i < c;i++)
	   {
	   System.out.printf("%d,",b[i]);
	   }
	   System.out.printf("%d",b[c]);
	}

}
