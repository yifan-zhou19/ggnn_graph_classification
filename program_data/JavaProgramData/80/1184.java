//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s1;
		int s2;
		int s3;
		int e1;
		int e2;
		int e3;
		int i;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			e1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			e3 = Integer.parseInt(tempVar6);
		}
		if (s1 == e1)
		{
			if (s2 == e2)
			{
				count = e3 - s3;
			}
			if (s2 != e2)
			{
				if ((s1 % 4 == 0 && s1 % 100 != 0) || (s1 % 400 == 0))
				{
					   if (s2 == 1 || s2 == 3 || s2 == 5 || s2 == 7 || s2 == 8 || s2 == 10 || s2 == 12)
					   {
						   count = count + 31 - s3;
					   }
					   if (s2 == 2)
					   {
						   count = count + 29 - s3;
					   }
					   if (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11)
					   {
						   count = count + 30 - s3;
					   }
					   for (i = s2 + 1;i < e2;i++)
					   {
						   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						   {
							   count = count + 31;
						   }
						   if (i == 4 || i == 6 || i == 9 || i == 11)
						   {
							   count = count + 30;
						   }
						   if (i == 2)
						   {
							   count = count + 29;
						   }
					   }
					   count = count + e3;
				}
				else
				{
					   if (s2 == 1 || s2 == 3 || s2 == 5 || s2 == 7 || s2 == 8 || s2 == 10 || s2 == 12)
					   {
						   count = count + 31 - s3;
					   }
					   if (s2 == 2)
					   {
						   count = count + 28 - s3;
					   }
					   if (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11)
					   {
						   count = count + 30 - s3;
					   }
					   for (i = s2 + 1;i < e2;i++)
					   {
						   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						   {
							   count = count + 31;
						   }
						   if (i == 4 || i == 6 || i == 9 || i == 11)
						   {
							   count = count + 30;
						   }
						   if (i == 2)
						   {
							   count = count + 28;
						   }
					   }
					   count = count + e3;
				}
			}
		}
		if (s1 != e1)
		{
			if ((s1 % 4 == 0 && s1 % 100 != 0) || (s1 % 400 == 0))
			{
				for (i = 1;i < s2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						count = count + 31;
					}
					if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						count = count + 30;
					}
					if (i == 2)
					{
						count = count + 29;
					}
				}
				count = 366 - count - s3;
			}
			if (s1 % 4 != 0 || (s1 % 100 == 0 && s1 % 400 != 0))
			{
				for (i = 1;i < s2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						count = count + 31;
					}
					if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						count = count + 30;
					}
					if (i == 2)
					{
						count = count + 28;
					}
				}
				count = 365 - count - s3;
			}
			for (i = s1 + 1;i < e1;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					count = count + 366;
				}
				else
				{
					count = count + 365;
				}
			}
			if ((e1 % 4 == 0 && e1 % 100 != 0) || (e1 % 400 == 0))
			{
				for (i = 1;i < e2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						count = count + 31;
					}
					if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						count = count + 30;
					}
					if (i == 2)
					{
						count = count + 29;
					}
				}
				count = count + e3;
			}
			if (e1 % 4 != 0 || (e1 % 100 == 0 && e1 % 400 != 0))
			{
				for (i = 1;i < e2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						count = count + 31;
					}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


