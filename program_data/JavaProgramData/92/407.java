package <missing>;

public class GlobalMembers
{
	public static void insertsort(int[] array, int left, int right)
	{
		 int i;
		 int j;
		 int temp;
		 for (i = left + 1; i <= right; i++)
		 {
			   temp = array[i];
			   for (j = i - 1; j >= left; j--)
			   {
					 if (array[j] > temp)
					 {
								 array[j + 1] = array[j];
					 }
					 else
					 {
						  break;
					 }
			   }
			   array[j + 1] = temp;
		 }
	}
	public static void merge(int[] array, int[] temp, int left, int right, int middle)
	{
		 int i;
		 int j;
		 int k;
		 int index1;
		 int index2;
		 for (i = left; i <= middle; i++)
		 {
			   temp[i] = array[i];
		 }
		 for (j = 1; j <= right - middle; j++)
		 {
			   temp[right - j + 1] = array[j + middle];
		 }
		 for (index1 = left,index2 = right, k = left; k <= right; k++)
		 {
					if (temp[index1] <= temp[index2])
					{
						 array[k] = temp[index1++];
					}
					else
					{
						 array[k] = temp[index2--];
					}
		 }
	}
	public static void mergesort(tangible.RefObject<Integer> array, tangible.RefObject<Integer> temp, int left, int right)
	{
		 if (right - left > 16)
		 {
				 int middle = (left + right) / 2;
				 mergesort(array, temp, left, middle);
				 mergesort(array, temp, middle + 1, right);
				 merge(array.argValue, temp.argValue, left, right, middle);
		 }
		 else
		 {
			  insertsort(array.argValue, left, right);
		 }
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			return 0;
		}
		int[] horse_q = new int[1005]; //????
		int[] horse_t = new int[1005]; //????
		int i;
		for (i = 0; i < n; i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					horse_t[i] = Integer.parseInt(tempVar2);
				}
		}
		for (i = 0; i < n; i++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					horse_q[i] = Integer.parseInt(tempVar3);
				}
		}
		int[] temp = new int[1005];
	tangible.RefObject<Integer> tempRef_horse_t = new tangible.RefObject<Integer>(horse_t);
	tangible.RefObject<Integer> tempRef_temp = new tangible.RefObject<Integer>(temp);
		mergesort(tempRef_horse_t, tempRef_temp, 0, n - 1);
		temp = tempRef_temp.argValue;
		horse_t = tempRef_horse_t.argValue;
	tangible.RefObject<Integer> tempRef_horse_q = new tangible.RefObject<Integer>(horse_q);
	tangible.RefObject<Integer> tempRef_temp2 = new tangible.RefObject<Integer>(temp);
		mergesort(tempRef_horse_q, tempRef_temp2, 0, n - 1);
		temp = tempRef_temp2.argValue;
		horse_q = tempRef_horse_q.argValue;
		int t_head = n - 1; //??????????
		int t_last = 0; //??????????
		int q_head = n - 1; //??????????
		int q_last = 0; //??????????
		int ans = 0; //??
		while (q_head >= q_last)
		{ //??????????
			 if (horse_t[t_head] > horse_q[q_head])
			 {
						   ans += 200;
						   t_head--;
						   q_head--;
			 }
			 else if (horse_t[t_head] < horse_q[q_head])
			 {
				  ans -= 200;
				  t_last++;
				  q_head--;
			 }
			 else
			 {
				  if (horse_t[t_last] > horse_q[q_last])
				  {
							ans += 200;
							t_last++;
							q_last++;
				  }
				  else
				  {
					   if (horse_t[t_last] < horse_q[q_head])
					   {
										  ans -= 200;
					   }
					   t_last++;
					   q_head--;
				  }
			 }
		}
		System.out.printf("%d\n",ans);
		main();
	}
}

