package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int max;
	  int second;
	  int[] a = new int[301];
	  char c;
	  i = 1;
	  max = 0;
	  second = 0;
	  do
	  {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		 if (a[i] > max)
		 {
			  second = max;
			max = a[i];
		 }
		 else if (a[i] > second && a[i] < max)
		 {
		  second = a[i];
		 }
		 if (scanf("%c", c) == EOF)
		 {
			 break;
		 }
		 i++;
	  }while (c == ',');
	  if ((i == 2) || (max == a[1] && second == 0))
	  {
		  System.out.print("No");
	  }
		else
		{
			System.out.printf("%d",second);
		}

	  /*scanf("%d",a[1]);
	  i=2;
	  max=a[1];
	  second=0;
	  while(scanf(",%d",&a[i])!=EOF)
	   { if(a[i]>max)
	      { second=max;
	        max=a[i];
	      }
	     else if(a[i]>second&&a[i]<max)
	      second=a[i];
	     i++;
	   }
	  if((i==2)||(max==a[1]&&second==0))printf("NO");
	    else printf("%d",second);*/

	  return 0;
	}

}

