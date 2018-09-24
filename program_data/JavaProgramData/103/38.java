package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1020]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   int t;
	   int j;
	   t = a.length();
	   int i;
	   int[] b = new int[1020];
	   int k;
	   int h = 0;
	   if (t == 1 && (a.charAt(0) - 'a') >= 0)
	   {
	   System.out.printf("(%c,%d)",a.charAt(0) - 32,1);
	   }
	   else if (t == 1 && (a.charAt(0) - 'a') <= 0)
	   {
	   System.out.printf("(%c,%d)",a.charAt(i),1);
	   }
	   else
	   {
		  for (i = 0;i <= t - 2;)
		  {
		  for (i = h,k = 1;i <= t - 2;i++)
		  {
		   if (a.charAt(i) - a.charAt(i + 1) == 0 || a.charAt(i) - a.charAt(i + 1) == 32 || a.charAt(i) - a.charAt(i + 1) == -32)
		   {
			k = k + 1;

		   }
		else
		{
		break;
		}

		  }
		  h = i + 1;
	   if (a.charAt(i) - 'a' >= 0)
	   {
		System.out.printf("(%c,%d)",a.charAt(i) - 32,k);
	   }
		else
		{
		System.out.printf("(%c,%d)",a.charAt(i),k);
		}
		  }
	   }
	}

}

