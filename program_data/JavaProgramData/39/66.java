package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int p;
	 int i;
	 int j;
	 int[] end = new int[100];
	 int[] class = new int[100];
	 int[] issue = new int[100];
	 int[] k = new int[100];
	 int sum = 0;
	 String monitor = new String(new char[100]);
	 String province = new String(new char[100]);
	 char[][] name = new char[100][20];
	 int max;
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
		  name[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  end[i] = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  class[i] = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar5 != null)
	  {
		  monitor = tangible.StringFunctions.changeCharacter(monitor, i, tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar6 != null)
	  {
		  province = tangible.StringFunctions.changeCharacter(province, i, tempVar6);
	  }
	  String tempVar7 = ConsoleInput.scanfRead(" ");
	  if (tempVar7 != null)
	  {
		  issue[i] = Integer.parseInt(tempVar7);
	  }
	 }

	 for (i = 0;i < n;i++)
	 {
	  k[i] = 0;
	 }
	 for (i = 0;i < n;i++)
	 {
	 if (end[i] > 80 && issue[i] >= 1)
	 {
		 k[i] = k[i] + 8000;
	 }
	 if (end[i] > 85 && class[i] > 80)
	 {
		 k[i] = k[i] + 4000;
	 }
	 if (end[i] > 90)
	 {
		 k[i] = k[i] + 2000;
	 }
	 if (end[i] > 85 && province.charAt(i) == 'Y')
	 {
		 k[i] = k[i] + 1000;
	 }
	 if (class[i] > 80 && monitor.charAt(i) == 'Y')
	 {
		 k[i] = k[i] + 850;
	 }
	 }

	 max = k[0];

	 for (i = 0;i < n;i++)
	 {
	  sum = sum + k[i];
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (k[i] > max)
	  {
	   max = k[i];
	   p = i;
	  }
	 }

	  System.out.printf("%s\n",name[p]);
	 System.out.printf("%d\n%d",max,sum);

	return 0;
	}




}

