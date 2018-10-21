package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] x = new int[n];
	   int[] y = new int[n];
	   int[] z = new int[n];
	   int i;
	   int j;
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  y[i] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  z[i] = Integer.parseInt(tempVar4);
		  }
	   }
	   double[] d = new double[((n - 1) * n / 2)];
	   int[] number1 = new int[((n - 1) * n / 2)];
	   int[] number2 = new int[((n - 1) * n / 2)];
	   int pos = 0; //number1?number2??????? (n-1)*n/2
	   for (i = 0;i < n - 1;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			 //d[i]=sqrt((x[i]-x[j])^2+(y[i]-y[j])^2+(z[i]-z[j])^2); //~????????
			 d[pos] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2) + Math.pow(z[i] - z[j],2));
			 number1[pos] = i;
			 number2[pos] = j;
			 pos++;
		  }
	   }
	   int k;
	   int f;
	   int g;
	   double e;
	   for (k = 1;k <= (n - 1) * n / 2;k++)
	   {
		  for (i = 0;i < (n - 1) * n / 2 - k;i++)
		  {
			 if (d[i] < d[i + 1])
			 {
				e = d[i];
				d[i] = d[i + 1];
				d[i + 1] = e;
				f = number1[i];
				number1[i] = number1[i + 1];
				number1[i + 1] = f;
				g = number2[i];
				number2[i] = number2[i + 1];
				number2[i + 1] = g;
			 }
		  }

	   }
	   for (k = 0;k < (n - 1) * n / 2;k++)
	   {
		  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[number1[k]],y[number1[k]],z[number1[k]],x[number2[k]],y[number2[k]],z[number2[k]],d[k]);
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(y);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(z);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(number1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(number2);
	   return 0;
	}

}

