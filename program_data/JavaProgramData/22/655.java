package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String c = new String(new char[1000]);
		 int j = 1;
		 int i;
		 int m;
		 int n;
		 int k = 2;
		 int[] a = new int[1000];
		 int t;
		 for (i = 1;i <= 1000;i++)
		 {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			if (c.charAt(i) == ',')
			{
			j++;
			}
			else if (c.charAt(i) == '\n')
			{
			continue;
			}
		 }
		for (i = 1;i <= j - 1;i++)
		{
			for (m = j;m > i;m--)
			{
			if (a[i] < a[m])
			{
			  t = a[i],a[i] = a[m],a[m] = t;
			}
			}
		}
		if (a[1] == a[j])
		{
			 System.out.print("No\n");
		}
		else
		{
		   for (i = 1;i <= j;i++)
		   {
			  n = i + 1;
			  if (a[i] == a[n])
			  {
			  k++;
			  }
			  else
			  {
				  break;
			  }
		   }
		System.out.printf("%d",a[k]);
		}
	}


}

