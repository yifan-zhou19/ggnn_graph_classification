package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct br
	// {
	//	 char no[10];
	//   int s;
	// }
	// a[100],b[100],r;
	 int n;
	 int i;
	 int j;
	 int t = 0;
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
			 a[i].no = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i].s = tempVar3;
		 }
	 if (a[i].s >= 60)
	 {
		 b[t] = a[i];
		 t = t + 1;
	 }
	 }
	 for (i = 0;i < t - 1;i++)
	 {
		 for (j = 0;j < t - 1 - i;j++)
		 {
			 if (b[j].s < b[j + 1].s)
			 {
			 r = b[j];
			 b[j] = b[j + 1];
			 b[j + 1] = r;
			 }
		 }
	 }
	 for (i = 0;i < t;i++)
	 {
		 System.out.printf("%s\n",b[i].no);
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (a[i].s >= 60)
		 {
			 continue;
		 }
		 else
		 {
			 System.out.printf("%s\n",a[i].no);
		 }
	 }
	}
}

