package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int num;
		 int i;
		 int[] s = new int[100];
		 int j;
		 int k;
		 int l;
		 int p;
		 int max = new int(int a,int b,int c);
		 int min = new int(int a,int b,int c);

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 num = Integer.parseInt(tempVar);
		 }

		 for (i = 0;i <= num - 1;i++)
		 {

			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s[i] = Integer.parseInt(tempVar2);
			  }
		 }

		 k = s[0];
		 j = s[1];

		 for (i = 2;i <= num - 1;i++)
		 {

			  l = min(k,j,s[i]);
			  p = k;
			  k = max(k,j,s[i]);
			  j = j + p + s[i] - k - l;
		 }



		 System.out.printf("%d\n%d",k,j);

		 return 0;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static max(int a, int b, int c)
	{
		  int m;
		  m = a > b != 0?a:b;
		  m = m > c != 0?m:c;
		  return m;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static min(int a,int b,int c)
	{
		  int s;
		  s = a > b != 0?b:a;
		  s = s > c != 0?c:s;
		  return s;
	}


}

