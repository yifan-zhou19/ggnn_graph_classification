package <missing>;

public class GlobalMembers
{
	public static int vd(Object t1, Object t2)
	{
	   return *((int)t1) > (int)t2?-1:1;
	}
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n != 0)
	  {
	   int i;
	   int j;
	   int m;
	   int head = 0;
	   int ans = 0;
	   int tailt = n - 1;
	   int tailk = n - 1;
	   int[] t = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *k=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   int k = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 t[i] = Integer.parseInt(tempVar2);
		 }
	   }
	   qsort(t,n,(Integer.SIZE / Byte.SIZE),vd);
	   for (i = 0;i < n;i++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 k[i] = tempVar3;
		 }
	   }
	   qsort(k,n,(Integer.SIZE / Byte.SIZE),vd);
	   for (i = 0;i < n;i++)
	   {
		 if (t[head] > k[i])
		 {
		   head++;
		   ans += 200;
		 }
		 else if (t[head] < k[i])
		 {
			tailt--;
			ans -= 200;
		 }
		 else if (t[head] == k[i])
		 {
		  for (j = tailt,m = tailk;j >= head;j--,m--)
		  {
			if (t[j] > k[m])
			{
			  ans += 200;
			  tailt--;
			  tailk--;
			}
			else
			{
			  if (t[j] < k[i])
			  {
				  ans -= 200;
			  }
			  tailt = j - 1;
			  tailk = m;
			  break;
			}
		  }
		 }
		 if (head > tailt)
		 {
			 break;
		 }
	   }
	   System.out.printf("%d\n",ans);
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   n = Integer.parseInt(tempVar4);
	   }
	  }
	   System.in.read();
	   System.in.read();
	}
}

