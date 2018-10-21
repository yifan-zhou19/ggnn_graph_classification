public class book
 {
	   public int num;
	   public String writer = new String(new char[26]);
 }

package <missing>;

public class GlobalMembers
{
	   public static int m;

	public static int Main()
	{

	  int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
		book[] p;
		p = tangible.Arrays.initializeWithDefaultbookInstances(m);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].writer = tempVar3.charAt(0);
			}
		}
		int j = 0;
		int u = 0;
		int[] a;
		a = new int[150];
		for (i = 'A';i <= 'z';i++)
		{
		a[i] = 0;
		}

		for (i = 'A';i <= 'Z';i++)
		{
			for (j = 0;j < m;j++)
			{
				for (u = 0;u < String.valueOf(p[j].writer).length();u++)
				{
					if (i == p[j].writer.charAt(u))
					{
						a[i]++;
						break;
					}
				}
			}
		}
		int max = 0;
		for (i = 'A';i <= 'Z';i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (max == a[i])
			{
			break;
			}
		}
		System.out.printf("%c\n%d\n",i,a[i]);
		for (j = 0;j < m;j++)
		{
			  for (u = 0;u < String.valueOf(p[j].writer).length();u++)
			  {
					if (i == p[j].writer.charAt(u))
					{
						System.out.printf("%d\n",p[j].num);
						break;
					}
			  }
		}







	   return 0;
	}






}

