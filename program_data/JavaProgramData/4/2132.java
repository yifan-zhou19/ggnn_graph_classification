package <missing>;

public class GlobalMembers
{
	int h,l,(*p)[100];
	public static void shuchu(int a)
	{
		int r;
		int c;
		int i = 0;
	 r = 0;
	 c = a;
	 for (;r < h;i++)
	 {
		 if (c >= 0 && c < l)
		 {
		System.out.printf("%d\n",*(*(p + r) + c));
		 }
	  r += 1;
	  c -= 1;
	 }

	}

	public static int Main()
	{
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 h = tempVar;
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 l = tempVar2;
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (int [100])malloc(h * 100 * (Integer.SIZE / Byte.SIZE));
	 for (i = 0;i < h;i++)
	 {
	  for (j = 0;j < l;j++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  *(p + i) + j = tempVar3;
		  }
	  }
	 }
	  for (i = 0;i < h + l - 1;i++)
	  {
		  shuchu(i);
	  }
	}
}

