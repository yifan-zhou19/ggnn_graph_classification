package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[350]);
		int[] a = new int[110];
		int i = 0;
		int num = 0;
		int same = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		a[0] = 0;


		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ',')
			{
				a[num] = 10 * a[num] + s.charAt(i) - '0';
			}
			if (s.charAt(i) == ',' || s.charAt(i) == '\0')
			{
				num++;
				a[num] = 0;
			}


		}
		for (i = 0;i <= num;i++)
		{
	   if (a[i] == a[0])
	   {
		   same++;
	   }
		}
			   if (num == 0)
			   {
				   System.out.print("No");
			   }
			 else if (same == num + 1)
			 {
				 System.out.print("No");
			 }
	   else
	   {
		int max = 0;
		int secmax = 0;
		for (i = 0;i <= num;i++)
		{
			if (a[i] >= max)
			{
				max = a[i];
			}
		}
		for (i = 0;i <= num;i++)
		{
			if (a[i] == max)
			{
				a[i] = 0;
			}
		}
		for (i = 0;i <= num;i++)
		{
			if (a[i] >= secmax)
			{
				secmax = a[i];
			}
		}
		System.out.printf("%d",secmax);
	   }



	}
}

