package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String let1 = new String(new char[50]);
	   String let2 = new String(new char[50]);
	   int i = 0;
	   int j = 0;
	   int n = 0;
	   for (i = 0;i < 50;i++)
	   {
		  let1 = let1.substring(0, i);
		  let2 = let2.substring(0, i);
	   }

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   let1 = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   let2 = tempVar2.charAt(0);
	   }
	//   printf("%s %s\n",let1,let2);

	//   printf("%c",let1[0]);
	   i = 0;
	   while (let2.charAt(i) != null)
	   {
		  if (let2.charAt(i) == let1.charAt(0))
		  {
	//	 printf("%d\n",i);
		 j = 1;
		 n = i;
		 while (let1.charAt(j) != null)
		 {
			if (let2.charAt(i + 1) == let1.charAt(j))
			{
			   j++;
			   i++;
			}
			else
			{
				break;
			}
		 }
		 if (let1.charAt(j) == 0)
		 {
			System.out.printf("%d\n",n);
			break;
		 }
		 else
		 {
			 i = n;
		 }
		  }
		  i++;
	   }
	}
}

