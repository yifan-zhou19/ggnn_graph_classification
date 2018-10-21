//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
public int num;
public String w = new String(new char[26]);

}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] book = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(999);
	public static AnonymousClass[] test = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(1);



	public static void Main(String[] args)
	{
	   int m;
	   int i;
	   int j;
	   int n;
	   int s;
	   char x;
	   char c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < m;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   book[i].num = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   book[i].w = tempVar3.charAt(0);
	   }


	   }

	   x = 'A';
	   n = 0;
	   c = 'A';
	   while (true)
	   {
		s = 0;
	   for (i = 0;i < m;i++)
	   {
		for (j = 0;j < String.valueOf(book[i].w).length();j++)
		{
		 if (book[i].w.charAt(j) == x)
		 {
			 s++;
		 }


		}
	   }

	   if (s > n)
	   {
	   n = s;
	   c = x;
	   }
	   if (x == 'Z')
	   {
		   break;
	   }
	   x++;
	   }
	   System.out.printf("%c\n%d\n",c,n);
	   for (i = 0;i < m;i++)
	   {
		for (j = 0;j < String.valueOf(book[i].w).length();j++)
		{
		 if (book[i].w.charAt(j) == c)
		 {
			 System.out.printf("%d\n",book[i].num);

		 }


		}
	   }
	}


}

