package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int da;
		int i;
		int j;
		int x;
		int y;
		int k;
		int len;
		int n;
		int[] dan = new int[201];
		int max;
		int min;
		String s = new String(new char[10000]);
		char[][] a = new char[201][50];
		   s = new Scanner(System.in).nextLine();
		   for (i = 0;i < 201;i++)
		   {
		   dan[i] = 0;
		   }
		   i = 0;
		   len = s.length();
		   while (i < len)
		   {
		   if (s.charAt(i) != ' ' && s.charAt(i) != ',')
		   {
			   a[0][i] = s.charAt(i);
			   i++;
		   }
		   else
		   {
			   break;
		   }
		   }
		   dan[0] = String.valueOf(a[0]).length();
		   x = i + 1;
		   j = 1;
		   y = 0;
		   while (x < len)
		   {
			   if (s.charAt(x) != ' ' && s.charAt(x) != ',')
			   {
				   dan[j]++;
				   a[j][y] = s.charAt(x);
				   y++;
				   x++;
			   }

				if (s.charAt(x) == ',' && s.charAt(x + 1) == ' ')
				{
					x = x + 2;
					j++;
					y = 0;
				}
			   if ((s.charAt(x) == ' ' || s.charAt(x) == ',') && (s.charAt(x + 1) != ' ' && s.charAt(x + 1) != ','))
			   {
				   x++;
				   j++;
				   y = 0;
			   }
		   }
		  k = j;

		 max = dan[0];
		 min = dan[0];
		   for (j = 1;j <= k;j++)
		   {
		  if (dan[j] > max)
		  {
		   max = dan[j];
		  }
		   }

		   for (j = 1;j <= k;j++)
		   {

		   if (dan[j] < min)
		   {
		   min = dan[j];
		   }
		   }

		 if (k == 1 || max == min)
		 {
		System.out.println(a[0]);
		System.out.println(a[0]);
		 }

		else if (max > min)
		{
		 for (i = 0;i <= k;i++)
		 {
		 if (dan[i] == max)
		 {
		 System.out.println(a[i]);
		 break;
		 }
		 }

		 for (i = 0;i <= k;i++)
		 {
		 if (dan[i] == min)
		 {
		 System.out.println(a[i]);
		 break;
		 }
		 }
		}
	}

}
