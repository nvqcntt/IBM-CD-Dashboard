//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace LocalCache.DataModel
{
    using System;
    using System.Collections.Generic;
    
    public partial class LocalTestscript
    {
    	public LocalTestscript()
    	{
    		this.Testcases = new HashSet<LocalTestcase>();
    	}
    
    	public int ID { get; set; }
    	public int ProjectID { get; set; }
    	public int WebID { get; set; }
    	public string Name { get; set; }
    	public string URL { get; set; }
    
    	public virtual LocalProject Project { get; set; }
    	public virtual ICollection<LocalTestcase> Testcases { get; set; }
    }
}
