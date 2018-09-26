public class bingren
{
	   public String id = new String(new char[10]);
	   public int o;
}

package <missing>;

public class GlobalMembers
{
	public static bingren[] bingren = tangible.Arrays.initializeWithDefaultbingrenInstances(201);
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int y;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   bingren[i].id = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   bingren[i].o = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 0,j = 100;i < n;i++)
	   {

		   if (bingren[i].o >= 60)
		   {
			   bingren[j] = bingren[i];
			   j++;
		   }
	   }
	   y = j;
	   for (j = 0;j < y - 1;j++)
	   {
		   for (i = 100;i < y - j;i++)
		   {
			   if (bingren[i].o < bingren[i + 1].o)
			   {
				   bingren[200] = bingren[i];
				   bingren[i] = bingren[i + 1];
				   bingren[i + 1] = bingren[200];
			   }
		   }
	   }
	   for (i = 100;i < y;i++)
	   {
		   System.out.printf("%s\n",bingren[i].id);
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (bingren[i].o < 60)
		   {
			   System.out.printf("%s\n",bingren[i].id);
		   }
	   }
	}


}

