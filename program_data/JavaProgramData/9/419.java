public class P
{
public String id = new String(new char[10]);
public int age;
}

package <missing>;

public class GlobalMembers
{
	public static P[] pa = tangible.Arrays.initializeWithDefaultPInstances(100);
	public static P[] pb = tangible.Arrays.initializeWithDefaultPInstances(100);
	public static int Main()
	{
		int n;
		int r = 0;
		int s = 0;
		int i;
		int o;
		int p;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		P temp = new P();
		for (i = 0;i < n;i++)
		{
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  temp.id = tempVar2.charAt(0);
				  }
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  (temp.age) = Integer.parseInt(tempVar3);
				  }
				  if (temp.age >= 60)
				  {
					  pb[r] = temp;
					  r++;
				  }
				  else
				  {
					  pa[s] = temp;
					  s++;
				  }
		}
				  for (o = 0;o < r;o++)
				  {
					  for (p = 0;p < r - o;p++)
					  {
						  if (pb[p].age < pb[p + 1].age)
						  {
							  P tmp = pb[p];
							  pb[p] = pb[p + 1];
							  pb[p + 1] = tmp;
						  }
					  }
				  }
				  for (j = 0;j < r;j++)
				  {
					  System.out.printf("%s\n",pb[j].id);
				  }
				  for (k = 0;k < s;k++)
				  {
					  System.out.printf("%s\n",pa[k].id);
				  }
		return 0;
	}
}

