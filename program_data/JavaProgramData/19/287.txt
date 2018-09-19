package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   char[][] a = new char[100][100];
	   String b = new String(new char[25]);
	   String c = new String(new char[25]);
	   char d;
	   int m;
	   int n;
	   int[] p = new int[25];
	   int q;
	   int i;
	   int j;

	   i = 0;
	   do
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = tempVar.charAt(0);
		   }
		   i++;
	   }while (System.in.read() != '\n');
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   c = tempVar3.charAt(0);
	   }
	   for (j = 0;j < i;j++)
	   {
		   p[j] = 1;
		   if (strcmp(a[j],b) == 0)
		   {
			   p[j] = 0;
		   }
	   }
	   for (j = 0;j < i;j++)
	   {
		   if (j != 0)
		   {
			   System.out.print(" ");
		   }
		   if (p[j] != 0)
		   {
			   System.out.printf("%s",a[j]);
		   }
		   else
		   {
			   System.out.printf("%s",c);
		   }
	   }
	}
}

