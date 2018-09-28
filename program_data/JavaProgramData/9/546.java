public class pat
{
   public String id = new String(new char[10]);
   public int age;
}

package <missing>;

public class GlobalMembers
{
		   public static pat[] pat = tangible.Arrays.initializeWithDefaultpatInstances(100);
	public static int Main()
	{
		  int n;
		  int[] a = new int[200];
		  int j;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (j = 0;j < 150;j++)
		  {
			  a[j] = 0;
		  }
		  for (i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  pat[i].id = tempVar2.charAt(0);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  pat[i].age = Integer.parseInt(tempVar3);
				  }
				  for (j = 1;j < 150;j++)
				  {
						  if (j == pat[i].age)
						  {
							  a[j]++;
						  }
				  }
		  }
		   for (j = 150;j >= 60;j--)
		   {
				 if (a[j] == 0)
				 {
					 continue;
				 }
			  for (i = 0;i < n;i++)
			  {
							  if (j == pat[i].age)
							  {
								  System.out.printf("%s\n",pat[i].id);
							  }
			  }
		   }
				   for (i = 0;i < n;i++)
				   {
							 if (pat[i].age < 60)
							 {
								 System.out.printf("%s\n",pat[i].id);
							 }
				   }
					System.in.read();
					System.in.read();
	}
}

