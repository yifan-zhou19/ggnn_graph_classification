public class stu
   {
	 public String a = new String(new char[21]);
	 public int[] b = new int[2];
	 public char c;
	 public char d;
	 public int e;
	 public int sum;
   }

package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		   stu[] h = tangible.Arrays.initializeWithDefaultstuInstances(100);
		   int n;
		   int i;
		   int j;
		   int k;
		   int sum1;
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
				 h[i].a = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 h[i].b[0] = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 h[i].b[1] = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 h[i].c = tempVar5.charAt(0);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 h[i].d = tempVar6.charAt(0);
			 }
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 h[i].e = Integer.parseInt(tempVar7);
			 }
			 h[i].sum = 0;
			if (h[i].b[0] > 80 && h[i].e >= 1)
			{
			 h[i].sum = h[i].sum + 8000;
			}
			 if (h[i].b[0] > 85 && h[i].b[1] > 80)
			 {
			 h[i].sum = h[i].sum + 4000;
			 }
			 if (h[i].b[0] > 90)
			 {
			 h[i].sum = h[i].sum + 2000;
			 }
			 if (h[i].b[0] > 85 && h[i].d == 'Y')
			 {
			 h[i].sum = h[i].sum + 1000;
			 }
			 if (h[i].b[1] > 80 && h[i].c == 'Y')
			 {
			 h[i].sum = h[i].sum + 850;
			 }
		   }
		//     for(i=0;i<n;i++)
		//      printf("%d\n",h[i].sum);
			 k = 0;
			 sum1 = h[0].sum;
			 for (i = 1;i < n;i++)
			 {
			   if (h[k].sum < h[i].sum)
			   {
			   k = i;
			   }
			   sum1 = sum1 + h[i].sum;
			 }
			 System.out.printf("%s\n%d\n%d\n",h[k].a,h[k].sum,sum1);
			 return 0;
	   }



}

